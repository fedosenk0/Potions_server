import Vue from 'vue'
import Vuex from 'vuex'
import PotionApi from "./api/potionApi"


Vue.use(Vuex)

 Vue.http.options.root = 'http://localhost:8080'
Vue.http.interceptors.push(function(request) {

  request.headers.set('Access-Control-Allow-Origin', 'http://localhost:8081')
});
export default new Vuex.Store({
  state: {

  },
  mutations: {

  },
  actions: {
    async addPotion({commit},data) {
      const result = await PotionApi.add(data.potion)
      const potion = await result.json()
        const fd = new FormData()
        console.log(data.file)
      fd.append('file',data.file,data.file.name)
        console.log(fd)
      const imgResult  = await PotionApi.addImage(fd,potion.id)
      console.log(imgResult);
    },

  }
})
