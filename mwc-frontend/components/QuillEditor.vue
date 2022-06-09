<template>
  <section>
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
</template>

<script>
import { debounce } from 'vue-debounce'
export default {
  props: {
    content: {
      type: String,
      default: () => '',
    },
  },
  data() {
    return {
      editedContent: this.content,
      editorOption: {
        theme: 'snow', // 可換
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
  },
}
</script>