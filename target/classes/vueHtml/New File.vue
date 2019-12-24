<template>
    
</template>

<script>
    export default {
        name: "${}"
    }
</script>
<script src="/path/to/vue.js"></script>
<script src="/path/to/vuex.js"></script>

<style scoped>

</style>

<div id="app">
    {{ message }}
</div>
<div id="app-2">
  <span v-bind:title="message">
    鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>