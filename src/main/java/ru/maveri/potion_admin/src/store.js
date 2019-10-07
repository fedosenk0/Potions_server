import Vue from 'vue'
import Vuex from 'vuex'
import PotionApi from "./api/potionApi"


Vue.use(Vuex)

// Vue.http.options.root = 'http://localhost:8080'
// Vue.http.interceptors.push(function(request) {
//
//   request.headers.set('Access-Control-Allow-Origin', 'http://localhost:8081')
// });
export default new Vuex.Store({
  state: {

  },
  mutations: {

  },
  actions: {
    async addPotion(potion){
      console.log(potion.name)
      const  result = await PotionApi.add(potion)
      const data = result.json()}
  }
})
