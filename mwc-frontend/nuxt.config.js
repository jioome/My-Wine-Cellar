const baseURL = process.env.BASE_URL || 'http://localhost:8000/api'
export default {
  // Global page headers: https://go.nuxtjs.dev/config-head
  head: {
    title: 'mwc-frontend',
    meta: [
      { charset: 'utf-8' },
      { name: 'viewport', content: 'width=device-width, initial-scale=1' },
      { hid: 'description', name: 'description', content: '' },
      { name: 'format-detection', content: 'telephone=no' },
    ],
    link: [{ rel: 'icon', type: 'image/x-icon', href: '/favicon.ico' }],
    script: [
      {
        src: 'https://kit.fontawesome.com/0ad7ed00eb.js',
        crossorigin: 'anonymous',
      },
    ],
  },

  // Global CSS: https://go.nuxtjs.dev/config-css
  css: [
    '@/assets/styles/scss/buefy.scss',
    'quill/dist/quill.snow.css',
    'quill/dist/quill.bubble.css',
  ],

  // Plugins to run before rendering page: https://go.nuxtjs.dev/config-plugins
  plugins: [
    { src: '~plugins/vue-quill-editor.js', ssr: false },
    { src: '~/plugins/infiniteloading', ssr: false },
    '~/plugins/lottie-vue-player.client.js',
  ],

  // Auto import components: https://go.nuxtjs.dev/config-components
  components: true,

  // Modules for dev and build (recommended): https://go.nuxtjs.dev/config-modules
  buildModules: [
    // https://go.nuxtjs.dev/eslint
    '@nuxtjs/eslint-module',
    '@nuxtjs/style-resources',
  ],

  styleResources: {
    scss: [
      './assets/styles/scss/main.scss',
      './assets/styles/scss/custom.scss',
    ],
  },

  // Modules: https://go.nuxtjs.dev/config-modules
  modules: [
    // https://go.nuxtjs.dev/buefy
    'nuxt-buefy',
    // https://go.nuxtjs.dev/axios
    '@nuxtjs/axios',
    // https://go.nuxtjs.dev/pwa
    '@nuxtjs/pwa',
    '@nuxtjs/auth-next',
  ],

  // Axios module configuration: https://go.nuxtjs.dev/config-axios
  axios: {
    // Workaround to avoid enforcing hard-coded localhost:3000: https://github.com/nuxt-community/axios-module/issues/308
    baseURL: '/',
  },

  // PWA module configuration: https://go.nuxtjs.dev/pwa
  pwa: {
    manifest: {
      lang: 'en',
    },
  },
  middleware: ['auth'],
  auth: {
    strategies: {
      google: {
        clientId: '<you client id>',
        codeChallengeMethod: '',
        responseType: 'code',
        endpoints: {
          token: 'http://localhost:8000/user/google/', // somm backend url to resolve your auth with google and give you the token back
          userInfo: 'http://localhost:8000/auth/user/', // the endpoint to get the user info after you recived the token
        },
      },
      kakao: {
        scheme: 'oauth2',
        clientId: process.env.KAKAO_CLIENT_ID,
        codeChallengeMethod: '',
        responseType: 'code',
        // grantType: 'authorization_code',
        endpoints: {
          authorization: 'https://kauth.kakao.com/oauth/authorize',
          token: `${baseURL}`,
          userInfo: `${baseURL}`,
        },
        token: {
          property: 'access_token',
          type: 'Bearer',
          maxAge: 18000,
        },
      },
    },
  },

  // Build Configuration: https://go.nuxtjs.dev/config-build
  build: {},
}
