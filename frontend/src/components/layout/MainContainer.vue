<template>
  <div class="main container-fluid block0">
    <div class="content-block-wrapper">
      <div class="content-block-inner">
          <game-block />
      </div>
    </div>
  </div>
</template>

<script>
  import GameBlock from '../game/GameBlock'
  export default {
    name: 'Main',
    components: {
      GameBlock
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

  .content-block-wrapper {
    padding: 50px 0;
  }
</style>
