<template>
  <h3>第一次写Vue</h3>
  <p> {{mag}} </p>
  <p>{{csnnhtml}}</p>
  <p v-html="csnnhtml"></p>
</template>


<script >
export default{
  data(){
    return{
      mag:"测试一下，神奇的语法",
      csnnhtml:"<a href= 'https://baidu.com'>百度</a>"

    }
  }
}

</script>




