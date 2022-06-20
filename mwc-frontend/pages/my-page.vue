<template>
  <div class="w-container">
    <div class="main-header p-4">
      <div class="main-header-items">
        <button class="is-size-3" @click="goBack">
          <i class="fa-solid fa-arrow-rotate-left"></i>
        </button>
        <span class="is-size-4">마이 페이지</span>
        <b-dropdown
          position="is-bottom-left"
          append-to-body
          aria-role="menu"
        >
          <template #trigger>
            <a class="navbar-item" role="button">
              <i class="mt-1 is-size-4 fa-solid fa-gear"></i>
            </a>
          </template>
          <b-dropdown-item value="logout" aria-role="menuitem">
            로그아웃
          </b-dropdown-item>
        </b-dropdown>
      </div>
      <div class="main-header-line mt-4"></div>
    </div>
    <div class="main-content">
      <div class="profile">
        <div class="profile__image">
          <img src="~/static/img/profile-image.png" alt="profile-image" />
        </div>
        <div class="profile__info">
          <p>{{userInfo.name}}</p>
          <p>{{userInfo.email}}</p>
        </div>
      </div>
      <div class="friend">
        <span>친구: {{userInfo.friend}}명</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      userInfo: {name: "다츠", friend: 15, email: "jwun95@naver.com", badges: {img: null, name: "와인 킬러"}}
    }
  },
  methods: {
    goBack() {
      this.$router.go(-1)
    },
  },
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
  padding: 2rem 4rem 2rem 4rem;
}
.profile {
  display: flex;
  align-items: center;

  &__image {
    width: 20%;
  }
  &__info {
    width: 65%;
    margin-left: 15%;
  }
}
</style>
