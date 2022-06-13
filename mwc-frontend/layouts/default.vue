<template>
  <div class="mobile-layout">
    <main>
      <Nuxt />
    </main>
    <div class="mobile-navbar">
      <Navbar />
    </div>
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
  min-height: 100vh;
  background: #a0a0a0;
}
main {
  height: 90vh;
}
.mobile-navbar {
  width: 414px;
  margin: auto;
  display: flex;
  align-items: center;
  background: #fff;
  height: 10vh;
  position: fixed;
  bottom: 0;
  z-index: 1000;
}
</style>
