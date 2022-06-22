<template>
  <div class="w-container">
    <Title :main-title="mainTitle" />
    <div class="main-content">
      <section class="quill">
        <client-only>
          <quill-editor
            ref="editor"
            v-model.lazy="editedContent"
            :options="editorOption"
            class="editor--border relative"
          />
        </client-only>
      </section>
      <div class="pt-1 has-text-right">
        <button class="upload-button is-size-5" @click="upload">완료</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      mainTitle: '와인 추가',
      editedContent: this.content,
      editorOption: {
        theme: 'snow',
        modules: {
          toolbar: {
            container: [
              ['bold', 'italic', 'underline', 'strike', 'code'],
              ['blockquote', 'code-block'],
              [{ header: [1, 2, 3, 4, 5, 6, false] }],
              [{ list: 'ordered' }, { list: 'bullet' }],
              [{ script: 'sub' }, { script: 'super' }],
              [{ indent: '-1' }, { indent: '+1' }],
              [{ size: ['small', false, 'large', 'huge'] }],
              [{ color: [] }, { background: [] }],
              [{ align: [] }],
              ['clean'],
              ['link', 'image', 'video'],
            ],
            handlers: {
              image: this.uploadImage,
            },
          },
        },
      },
    }
  },
  methods: {
    upload() {
      this.$router.push({ name: 'index' })
    },
  },
}
</script>
<style lang="scss" scoped>
.main-content {
  padding: 1rem;

  section {
    height: 90%;
  }
}
.quill {
  width: 90%;
  margin: auto;
}
.quill-editor {
  height: 75%;
  background: $white-color;

  &::v-deep .ql-container {
    background: $white-color;
    max-height: 30rem;
  }
}

.upload-button {
  color: $white-color;
  width: 5rem;
  height: 2.5rem;
  background: $base-color-light;
  border-radius: 8px;
}
</style>
