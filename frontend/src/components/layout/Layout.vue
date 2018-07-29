<template>
  <div class="layout">
    <el-container>
      <el-header height="86px">
        <Topbar />
      </el-header>
      <el-main>Main</el-main>
      <el-footer>Footer</el-footer>
    </el-container>
  </div>
</template>

<script>
  // components
  import Topbar from './Topbar'
  // data
  import RequestService from '../../services/RequestService'

  export default {
    name: 'Layout',
    data () {
      return {
        questions: []
      }
    },
    async mounted () {
      this.questions = await RequestService.getQuestions()
    },
    components: {
      Topbar
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

  .el-header {
    padding: 0;
  }
</style>
