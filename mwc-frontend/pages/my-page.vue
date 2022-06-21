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
            <a class="navbar-item has-text-primary" role="button">
              <i class="mt-1 is-size-3 fa-solid fa-gear"></i>
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
          <div v-if="editMode" class="is-flex is-align-items-center"><b-field class="pt-3">
            <b-input v-model="userInfo.name"></b-input>
        </b-field><button class="is-size-5 has-text-white has-background-success ml-2" @click="editName(userInfo.name)">확인</button><button class="is-size-5 has-text-white has-background-danger ml-2" @click="editMode=false">취소</button></div>
          <div v-else class="is-flex is-align-items-center"><span class="profile__name">{{userInfo.name}}</span><button class="is-size-5 has-text-primary" @click="editMode=true"><i class="fa-solid fa-pen-to-square"></i></button></div>
          <p class="profile__email">{{userInfo.email}}</p>
        </div>
      </div>
      <div class="friend p-6 is-size-5 has-text-weight-bold has-text-right">
        <span>친구: {{userInfo.friend}}명</span>
      </div>
      <div class="pb-4 has-text-weight-semibold pl-6"><span>나의 뱃지: {{userInfo.badges.length}}개</span></div>
      <div class="badges is-flex is-justify-content-space-evenly is-flex-wrap-wrap">
        <div v-for="item in userInfo.badges" :key="item" class="has-text-centered badge">
          <div class="badge-img">
            <img src="~static/img/badge.png" alt="badge" />
          </div>
          <span class="has-text-weight-bold">{{item.name}}</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      userInfo: {name: "다츠", friend: 15, email: "jwun95@naver.com", badges: [{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"},{img: '~static/img/badge.png', name: "와인 킬러"}]},
      editMode: false
    }
  },
  methods: {
    goBack() {
      this.$router.go(-1)
    },
    editName(name) {
      this.userInfo.name = name;
      this.editMode = false;
    }
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
  padding: 2rem 1rem 2rem 1rem;
}
.profile {
  width: 90%;
  margin: auto;
  display: flex;
  align-items: center;
  background: $base-color-lighter;
  color: $black-color;
  padding: 1rem;
  border-radius: 4px;
  border: 1px solid $base-color-dark;

  &__image {
    width: 20%;

    img {
      border-radius: 50%;
    }
  }
  &__info {
    width: 65%;
    margin-left: 15%;

    button {
      width: 4rem;
      height:2.5rem;
      border-radius: 4px;
    }
  }
  &__name {
    font-size: 1.5em;
    font-weight: bold;
  }
  &__email {
    font-size: 1.2em;
  }
}

.badges {
  border: 2px solid $base-color;
  height: 20rem;
  width: 90%;
  margin: auto;
  overflow: scroll;
}

.badge {
  height: 45%;
  display: flex;
  width: 30%;
  align-items: center;
  flex-direction: column;
}

.badge-img {
  margin: auto;
  width: 40%;
}
</style>
