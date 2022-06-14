<template>
  <div class="w-container">
    <div class="main-header p-4">
      <div class="main-header-items">
        <span class="is-size-4">다츠님의 와인 셀러</span>
        <button class="is-size-3"><i class="fa-solid fa-user"></i></button>
      </div>
      <div class="main-header-line mt-4"></div>
    </div>
    <div class="main-content">
      <section class="my-cellar">
        <div v-for="item in myCellarData" :key="item">
          <h1>{{item.title}}</h1>
          <span>{{item.content}}</span>
        </div>
      </section>
      <section class="guest-book">
        <div v-for="item in guestBook" :key="item">
          <h1>{{item.user}}</h1>
          <span>{{item.content}}</span>
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
      myCellarData: [{title: '레드와인', content: "이거 은근 맛있어요."},{title: '화이트와인', content: "이것도 은근 맛있어요."}],
      guestBook: [{user: "미닛", content: "안녕하세요"}, {user: "나미", content: "반가워요"}]
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
.main-content {
  height: 90%;
  .my-cellar {
    height: 50%;
  }
  .guest-book {
    height: 50%;
  }
}
</style>
