<template>
    <ul class="navbar-icons">
        <li><button class="is-size-2"><i class="fa-solid fa-eye"></i></button></li>
        <li><button class="is-size-2"><i class="fa-solid fa-house"></i></button></li>
        <li><button class="is-size-2"><i class="fa-solid fa-plus"></i></button></li>
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