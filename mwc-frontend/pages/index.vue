<template>
  <div class="w-container">
    <div class="main-header p-4">
      <div class="main-header__items pb-3">
        <span class="is-size-4 has-text-weight-bold">다츠님의 와인 셀러</span>
        <NuxtLink :to="{ name: 'my-page' }" class="is-size-3"
          ><i class="fa-solid fa-user"></i
        ></NuxtLink>
      </div>
      <div class="main-header__line"></div>
    </div>
    <div class="main-content p-4">
      <div class="more-info pt-3 has-text-right">
        <NuxtLink to="">더보기</NuxtLink>
      </div>
      <section class="my-cellar is-flex is-flex-wrap-wrap">
        <NuxtLink
          v-for="(item, idx) in myCellarData"
          :key="idx"
          to=""
          class="my-cellar__item has-text-centered"
        >
          <img src="~static/img/wine.jpeg" alt="wine-image" />
          <h1>{{ item.title }}</h1>
        </NuxtLink>
      </section>
      <div class="more-info pt-4 has-text-right">
        <NuxtLink to="">더보기</NuxtLink>
      </div>
      <section class="pb-3">
        <div
          class="guest-book is-flex is-flex-wrap-wrap is-justify-content-space-evenly"
        >
          <NuxtLink
            v-for="(item, idx) in guestBook"
            :key="idx"
            to=""
            class="guest-book__item mr-3"
          >
            <h1>{{ item.user }}</h1>
            <span>{{ item.content }}</span>
          </NuxtLink>
        </div>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: 'IndexPage',
  data() {
    return {
      myCellarData: [
        { title: '레드와인', content: '이거 은근 맛있어요.' },
        { title: '화이트와인', content: '이것도 은근 맛있어요.' },
        { title: '그냥와인', content: '이것도 은근 맛있어요.' },
        { title: '그냥와인', content: '이것도 은근 맛있어요.' },
      ],
      guestBook: [
        { user: '미닛', content: '안녕하세요' },
        { user: '나미', content: '반가워요' },
        { user: '나미', content: '반가워요' },
        { user: '나미', content: '반가워요' },
        { user: '나미', content: '반가워요' },
        { user: '나미', content: '반가워요' },
      ],
    }
  },
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
.main-content {
  height: 90%;
}

.my-cellar {
  border: 2px solid $base-color;
  border-radius: 6px;

  &__item {
    width: 30%;
    margin: 0.3rem;
  }
}

.guest-book {
  height: 15rem;
  padding: 1rem;
  margin: auto;
  background-image: url('~static/img/wall.jpg');

  &__item {
    background-color: #e9dd57;
    max-width: 10rem;
    width: 26%;
    height: 6rem;
    padding: 0.3rem;
    overflow: hidden;
  }
}
</style>
