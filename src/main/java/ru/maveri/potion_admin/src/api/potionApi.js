import Vue from 'vue'

const potions = Vue.resource('admin/potion{/id}')

export default {
    add: potion => potions.save({}, potion),

}