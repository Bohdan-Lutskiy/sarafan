<template>
    <v-container v-if="!profile">You need login through
        <a href="/login">Google</a>
    </v-container>
</template>

<script>
    export default {
        name: "Auth"
    }
</script>

<style scoped>

</style>