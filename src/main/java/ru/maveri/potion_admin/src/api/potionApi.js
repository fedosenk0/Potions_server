import Vue from 'vue'

const potions = Vue.resource('admin/potion{/id}')
const images = Vue.resource('admin/potion/{id}/image')

export default {
    add: potion => potions.save({}, potion),
    addImage: (files,id)=> images.save( {id},files)

}