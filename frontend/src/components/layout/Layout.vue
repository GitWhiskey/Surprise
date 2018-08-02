<template>
  <div class="layout">
    <topbar />
    <main-container />
    <button @click="resetQuestions">Reset</button>
  </div>
</template>

<script>
  // components
  import Topbar from './Topbar'
  import MainContainer from './MainContainer'

  import RequestService from '../../services/RequestService'

  export default {
    name: 'Layout',
    components: {
      Topbar, MainContainer
    },
    methods: {
      async resetQuestions () {
        let questions = await RequestService.getQuestions()
        let i = 1
        for (let q of questions) {
          q.isPassed = false
          await RequestService.updateQuestion(i, q)
          i++
        }
        console.log('Done!')
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
