<template>
  <div class="mobile-layout">
      <Nuxt />
    <nav class="mobile-navbar has-background-primary">
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
  min-width: 360px;
  margin: auto;
  background: #f9f9f9;
  padding-bottom: 6rem;
  height: 100%;
}
.mobile-navbar {
  max-width: 768px;
  min-width: 360px;
  width: 100%;
  margin: auto;
  display: flex;
  align-items: center;
  position: fixed;
  bottom: 0;
  z-index: 1000;
  height: 6rem;
}
</style>
