<template>
    <v-layout>
        <v-text-field class="px-3"
                label="Add comment"
                placeholder="Write something"
                v-model="text"
                @keyup.enter="save"
        />
        <v-btn class="pr-3"
                @click="save">
            Add
        </v-btn>
    </v-layout>
</template>

<script>
    import {mapActions} from 'vuex'

    export default {
        name: 'CommentForm',
        props: ['messageId'],
        data() {
            return {
                text: ''
            }
        },
        methods: {
            ...mapActions(['addCommentAction']),
            async save() {
                await this.addCommentAction({
                    text: this.text,
                    message: {
                        id: this.messageId
                    }
                })
                this.text = ''
            }
        }
    }
</script>

<style scoped>
</style>