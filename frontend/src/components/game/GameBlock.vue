<template>
  <div class="game-block">
    <span v-show="answerIsRight">
      Правильно!
    </span>
    <div class="white-block games user white-block-v1" v-if="questions && currentQuestion">
      <div class="progress">
        <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar"
             :aria-valuenow="currentQuestionIndex"
             aria-valuemin="0" :aria-valuemax="questions.length" :style="'width: ' + percentComplete">
          <div class="prize fa fa-trophy"></div>
        </div>
        <div class="answered_questions_count"> {{ currentQuestionIndex }} / {{ questions.length }} </div>
      </div>

      <div class="font-main font-bold font-tiny notice">Вопрос номер {{ currentQuestionIndex + 1 }}:</div>
      <div class="question_text">
        <p>{{ currentQuestion.story }}</p>
        <p><strong>{{ currentQuestion.questionText }}</strong></p>
      </div>
      <!-- TIPS -->
      <div class="tips">
        <div class="notice">{{ `Подсказки (осталось ${tipsLeft}):` }}</div>
        <span v-for="(tip, index) in currentQuestion.tips" :key="index">
          <div v-if="!tip.isUsed" class="tip unused">
            <span>
              <a class="use_tip" @click="openTip(index)">
                <img alt="Tip black" src="../../assets/tip_black.png" />
              </a>
            </span>
          </div>
          <div class="tip used" v-else>
            <img alt="Tip green" src="../../assets/tip_green.png">
            <div class="tip-text">
              <p>{{ tip.tipText }}</p>
            </div>
          </div>
        </span>
      </div>
      <!-- TIPS END -->
      <form accept-charset="UTF-8"  class="edit_game" id="edit_game_5b621ba03635307a563f0200" method="post" style="margin-top: 10px">
        <input class="form-control button-style-1" id="answer" name="answer" placeholder="Введите свой ответ" type="text" v-model="answer">
        <span v-show="answerIsWrong">
          Неверный ответ
        </span>
        <div class="buttons">
          <input class="button-style-1 mint send_answer" name="commit" type="submit" value="Ответить" @click.prevent="submitAnswer">
          <a class="button-style-1 orange sos" href="#" style="margin-left: 5px">SOS</a>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
  // data
  import RequestService from '../../services/RequestService'

  export default {
    name: 'GameBlock',
    data () {
      return {
        questions: [],
        currentQuestion: null,
        currentQuestionIndex: 0,
        answer: null,
        answerIsWrong: false,
        answerIsRight: false
      }
    },
    computed: {
      percentComplete () {
        return (this.currentQuestionIndex / this.questions.length) * 100 + '%'
      },
      tipsLeft () {
        return this.currentQuestion.tips.filter(t => !t.isUsed).length
      }
    },
    async mounted () {
      this.questions = await RequestService.getQuestions()
      this.currentQuestion = this.questions.find(q => !q.isPassed)
      this.currentQuestionIndex = this.questions.findIndex(q => !q.isPassed)
    },
    methods: {
      async openTip (tipIndex) {
        this.currentQuestion.tips[tipIndex].isUsed = true
        await RequestService.updateQuestion(this.currentQuestionIndex + 1, this.currentQuestion)
      },
      async submitAnswer () {
        this.answerIsWrong = false
        this.answerIsRight = false

        let answers = Array.from(this.currentQuestion.answers).map(a => a.toLowerCase())
        if (answers.includes(this.answer.toLowerCase())) {
          this.currentQuestion.isPassed = true
          await RequestService.updateQuestion(this.currentQuestionIndex + 1, this.currentQuestion)
          this.currentQuestionIndex++
          this.currentQuestion = this.questions[this.currentQuestionIndex]
          this.answerIsRight = true
        } else {
          this.answerIsWrong = true
        }
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .game-block .notice {
    border-bottom: 1px solid #eee;
    margin-bottom: 20px;
    text-align: left;
  }

  .question_text {
    text-align: left;
  }
</style>
