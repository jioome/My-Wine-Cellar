<template>
  <nav class="mobile-navbar has-background-primary">
    <ul class="mobile-navbar__icons">
      <li>
        <nuxt-link
          :to="{ name: 'wine-board' }"
          class="mobile-navbar__icon is-size-2 has-text-primary-light"
          ><i class="fa-solid fa-eye"></i
        ></nuxt-link>
      </li>
      <li>
        <nuxt-link
          :to="{ name: 'index' }"
          class="mobile-navbar__icon is-size-2 has-text-primary-light"
          ><i class="fa-solid fa-house"></i
        ></nuxt-link>
      </li>
      <li>
        <nuxt-link
          :to="{ name: 'add-wine' }"
          class="mobile-navbar__icon is-size-2 has-text-primary-light"
          ><i class="fa-solid fa-plus"></i
        ></nuxt-link>
      </li>
    </ul>
  </nav>
</template>

<script>
export default {
  name: 'NavbarComponent',
}
</script>

<style lang="scss" scoped>
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

  &__icons {
      display: flex;
  width: 100%;
  justify-content: space-evenly;
  align-items: center;
  }
}
</style>
