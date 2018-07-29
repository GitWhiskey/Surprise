<template>
  <div class="game-block">
    <div class="white-block games user white-block-v1" v-if="questions && currentQuestion.question">
      <div class="progress">
        <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" :aria-valuenow="currentQuestion.index"
             aria-valuemin="0" :aria-valuemax="questions.length" :style="'width: ' + percentComplete">
          <div class="prize fa fa-trophy"></div>
        </div>
        <div class="answered_questions_count"> {{ currentQuestion.index}} / {{ questions.length }} </div>
      </div>

      <div class="font-main font-bold font-tiny notice">Вопрос номер {{ currentQuestion.index + 1 }}:</div>
      <div class="question_text">
        {{ currentQuestion.question.questionText }}
        </div>
      <form accept-charset="UTF-8" class="edit_game" method="post">
        <input id="answer" name="answer" placeholder="Введите свой ответ" type="text">
        <div class="buttons">
          <input class="btn btn-lg btn-success next-button button-style-1 mint" name="commit" type="submit" value="Далее">
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
        currentQuestion: {
          index: 0,
          question: null
        }
      }
    },
    computed: {
      percentComplete () {
        return (this.currentQuestion.index / this.questions.length) * 100 + '%'
      }
    },
    async mounted () {
      this.questions = await RequestService.getQuestions()
      this.currentQuestion.question = this.questions[0]
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
