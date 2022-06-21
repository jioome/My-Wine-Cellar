<template>
  <div class="w-container">
    <Title :main-title="mainTitle" />
    <div class="main-content">
      <section class="">
        <client-only>
          <quill-editor
            ref="editor"
            v-model.lazy="editedContent"
            :options="editorOption"
            class="editor--border relative"
            @change="debounceTextChange"
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
import { debounce } from 'vue-debounce'
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
    debounceTextChange: debounce(function () {
      this.$emit('text-change', this.editedContent)
    }, 3000),
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
.quill-editor {
  height: 80%;
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
