<template>
    <div class="main-header p-4">
        <div class="main-header__items">
        <button class="is-size-3" @click="goBack"><i class="fa-solid fa-arrow-rotate-left"></i></button>
        <span class="has-text-weight-bold is-size-4">{{mainTitle}}</span>
        <NuxtLink :to="{name: 'my-page'}" class="is-size-3"><i class="fa-solid fa-user"></i></NuxtLink>
        </div>
        <div class="main-header__line mt-4"></div>
    </div>
</template>

<script>
    export default {
        name: 'TitleComponent',
        props: {
            mainTitle: {
                type: String,
                default: ''
            }
        },
        methods: {
          goBack() {
            this.$router.go(-1);
          }
        }
    }
</script>

<style lang="scss" scoped>
.main-header {
  &__items {
    width: 80%;
    margin: auto;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  &__line {
    width: 80%;
    height: 2px;
    background: black;
    margin: auto;
  }
}
</style>