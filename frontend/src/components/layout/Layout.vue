<template>
  <div class="layout">
    <topbar />
    <main-container />
  </div>
</template>

<script>
  // components
  import Topbar from './Topbar'
  import MainContainer from './MainContainer'

  export default {
    name: 'Layout',
    components: {
      Topbar, MainContainer
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
