<template>
  <div class="w-container">
    <Title :main-title="mainTitle" />
    <div class="main-content">
      <div class="friend-list">
        <div class="list-title columns has-text-weight-bold is-mobile is-centered">
          <div class="column is-3">대표 뱃지</div>
          <div class="column is-6">친구 이름</div>
          <div class="column is-3">와인 갯수</div>
        </div>
        <NuxtLink
          v-for="item in list_items"
          :key="item"
          :to="{name:'/'}"
          class="list-item columns is-mobile is-centered"
        >
          <div class="column is-3">{{item.badge}}</div>
          <div class="column is-6">{{item.name}}</div>
<div class="column is-3">와인: {{item.wine_num}}병</div>
        </NuxtLink>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      mainTitle: '친구 목록',
      list_items: [
        { name: '다츠', badge: 'gold', wine_num: 5 },
        { name: '다츠', badge: 'gold', wine_num: 5 },
        { name: '다츠', badge: 'gold', wine_num: 5 },
        { name: '다츠', badge: 'gold', wine_num: 5 },
        { name: '다츠', badge: 'gold', wine_num: 5 },
      ],
    }
  },
}
</script>

<style lang="scss" scoped>
.friend-list {
    width: 74%;
    margin: auto;
    padding-top: 6rem;
}

.list-title {
    border-bottom: 2px solid $black-color;
}

.list-item {
    border-bottom: 1px solid $gray-color;
        &:hover {
        background: $gray-color-light;
    }
}
</style>
