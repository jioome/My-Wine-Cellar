<template>
    <div class="main-header p-4">
        <div class="main-header-items">
        <button class="is-size-3"><i class="fa-solid fa-arrow-rotate-left"></i></button>
        <span class="is-size-6">{mainTitle}</span>
        <button class="is-size-3"><i class="fa-solid fa-user"></i></button>
        </div>
        <div class="main-header-line mt-4"></div>
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
        }
    }
</script>

<style lang="scss" scoped>
.main-header {
  &-items {
    width: 80%;
    margin: auto;
    display: flex;
    justify-content: space-between;
    align-items: center;

    span {
      font-weight: bold;
    }
  }
  &-line {
    width: 80%;
    height: 3px;
    background: black;
    margin: auto;
  }
}
</style>