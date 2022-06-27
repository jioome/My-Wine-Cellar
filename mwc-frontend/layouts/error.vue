<template>
  <div class="w-container">
    <Title :main-title="String(error.statusCode)" />
    <div class="main-content has-text-centered pt-6">
      <lottie-vue-player
        :src="`https://assets7.lottiefiles.com/packages/lf20_pNx6yH.json`"
        :player-controls="false"
        background-color="#f9f9f9"
        :loop="true"
        :autoplay="true"
        style="width: 100%; height: 35rem"
      >
      </lottie-vue-player>
      <div class="pt-6"><nuxt-link to="/" class="is-size-4 has-text-weight-bold">"홈으로 이동"</nuxt-link></div>

    </div>
  </div>
</template>

<script>
export default {
  name: 'ErrorPage',
  props: {
    error: {
      type: Object,
      default: null,
    },
  },
  data() {
    return {}
  },
}
</script>
