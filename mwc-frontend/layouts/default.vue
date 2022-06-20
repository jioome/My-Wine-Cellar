<template>
  <div class="mobile-layout">
      <Nuxt />
    <nav class="mobile-navbar">
      <Navbar />
    </nav>
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
  margin: auto;
  background: #a0a0a0;
  padding-bottom: 6rem;
  height: 100%;
}
.mobile-navbar {
  width: 414px;
  margin: auto;
  display: flex;
  align-items: center;
  background: #fff;
  position: fixed;
  bottom: 0;
  z-index: 1000;
  height: 6rem;
}
</style>
