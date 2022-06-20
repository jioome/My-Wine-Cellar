<template>
    <ul class="navbar-icons">
        <li><nuxt-link :to="{name: 'wine-board'}" class="is-size-2 has-text-primary-light"><i class="fa-solid fa-eye"></i></nuxt-link></li>
        <li><nuxt-link :to="{name: 'index'}" class="is-size-2 has-text-primary-light"><i class="fa-solid fa-house"></i></nuxt-link></li>
        <li><nuxt-link :to="{name: 'add-wine'}" class="is-size-2 has-text-primary-light"><i class="fa-solid fa-plus"></i></nuxt-link></li>
    </ul>
</template>

<script>
    export default {
        name: 'NavbarComponent'
    }
</script>

<style lang="scss" scoped>
.navbar-icons {
    display: flex;
    width: 100%;
    justify-content: space-evenly;
    align-items: center;

    button {
        border-radius: 45%;
    }
}
</style>