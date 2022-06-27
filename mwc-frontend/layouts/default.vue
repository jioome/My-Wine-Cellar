<template>
  <div class="mobile-layout">
      <Nuxt />
      <Navbar />
  </div>
</template>

<script>
  export default {
    name: 'MobileLayout'
  }
</script>

<style lang="scss" scoped>
.mobile-layout {
  max-width: 768px;
  min-width: 360px;
  margin: auto;
  background: #f9f9f9;
  padding-bottom: 6rem;
  height: 100%;
}
</style>
