(function(t){function e(e){for(var a,l,s=e[0],i=e[1],c=e[2],u=0,d=[];u<s.length;u++)l=s[u],Object.prototype.hasOwnProperty.call(n,l)&&n[l]&&d.push(n[l][0]),n[l]=0;for(a in i)Object.prototype.hasOwnProperty.call(i,a)&&(t[a]=i[a]);p&&p(e);while(d.length)d.shift()();return r.push.apply(r,c||[]),o()}function o(){for(var t,e=0;e<r.length;e++){for(var o=r[e],a=!0,s=1;s<o.length;s++){var i=o[s];0!==n[i]&&(a=!1)}a&&(r.splice(e--,1),t=l(l.s=o[0]))}return t}var a={},n={app:0},r=[];function l(e){if(a[e])return a[e].exports;var o=a[e]={i:e,l:!1,exports:{}};return t[e].call(o.exports,o,o.exports,l),o.l=!0,o.exports}l.m=t,l.c=a,l.d=function(t,e,o){l.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:o})},l.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},l.t=function(t,e){if(1&e&&(t=l(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var o=Object.create(null);if(l.r(o),Object.defineProperty(o,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)l.d(o,a,function(e){return t[e]}.bind(null,a));return o},l.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return l.d(e,"a",e),e},l.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},l.p="/api/";var s=window["webpackJsonp"]=window["webpackJsonp"]||[],i=s.push.bind(s);s.push=e,s=s.slice();for(var c=0;c<s.length;c++)e(s[c]);var p=i;r.push([0,"chunk-vendors"]),o()})({0:function(t,e,o){t.exports=o("56d7")},1:function(t,e){},"56d7":function(t,e,o){"use strict";o.r(e);var a=o("2b0e"),n=o("28dd");a["a"].use(n["a"]);var r=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("v-app",[o("app-bar"),o("v-content",[o("add-potion")],1)],1)},l=[],s=o("dd38"),i=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("v-card",{staticClass:"mx-auto my-3 pa-6",attrs:{width:"500px"}},[[o("v-container",{attrs:{fluid:""}},[o("v-form",{staticClass:"text-center"},[o("span",[t._v("Новое зелье")]),o("v-row",{staticClass:"py-0 ma-0"},[o("v-col",{staticClass:"py-0 ma-0",attrs:{cols:"8"}},[o("v-text-field",{attrs:{label:"Название"},model:{value:t.potion.name,callback:function(e){t.$set(t.potion,"name",e)},expression:"potion.name"}})],1),o("v-col",{staticClass:"py-0 ma-0",attrs:{cols:"3"}},[o("input",{attrs:{type:"file"},on:{change:t.onFileSelected}})]),o("v-row",{staticClass:"py-0 mx-3 my-0 "},[o("v-col",{attrs:{cols:"3"}},[o("v-text-field",{attrs:{label:"значение"},model:{value:t.potion.p1,callback:function(e){t.$set(t.potion,"p1",e)},expression:"potion.p1"}})],1),o("v-col",{attrs:{cols:"3"}},[o("v-text-field",{attrs:{label:"значение"},model:{value:t.potion.p2,callback:function(e){t.$set(t.potion,"p2",e)},expression:"potion.p2"}})],1),o("v-col",{attrs:{cols:"3"}},[o("v-text-field",{attrs:{label:"значение"},model:{value:t.potion.p3,callback:function(e){t.$set(t.potion,"p3",e)},expression:"potion.p3"}})],1),o("v-col",{attrs:{cols:"3"}},[o("v-text-field",{attrs:{label:"значение"},model:{value:t.potion.p4,callback:function(e){t.$set(t.potion,"p4",e)},expression:"potion.p4"}})],1)],1),o("v-col",{attrs:{cols:"12"}},[o("v-progress-linear",{attrs:{color:"light-blue",value:t.potion.p1/10*100}})],1),o("v-col",{attrs:{cols:"12"}},[o("v-progress-linear",{attrs:{color:"light-green darken-4",value:t.potion.p2/10*100}})],1),o("v-col",{attrs:{cols:"12"}},[o("v-progress-linear",{attrs:{color:"lime",value:t.potion.p3/10*100}})],1),o("v-col",{attrs:{cols:"12"}},[o("v-progress-linear",{attrs:{color:"deep-orange",striped:"",value:t.potion.p4/10*100}})],1),o("v-col",{attrs:{cols:"12"}},[o("v-textarea",{attrs:{solo:"",name:"input-7-4",label:"Описание"},model:{value:t.potion.description,callback:function(e){t.$set(t.potion,"description",e)},expression:"potion.description"}})],1),o("v-col",{attrs:{cols:"6"}},[o("v-btn",{attrs:{text:"",large:"",color:"primary"},on:{click:t.saveButton}},[t._v("\n                            Добавить\n                        ")])],1),o("v-col",{attrs:{cols:"6"}},[o("v-btn",{attrs:{text:"",large:"",color:"error"}},[t._v("Отменить")])],1)],1)],1)],1)]],2)},c=[],p=o("2f62"),u={data(){return{potion:{name:"",description:"",p1:1,p2:1,p3:1,p4:1},selectedFile:null}},methods:{...Object(p["b"])(["addPotion"]),saveButton(){const t={potion:this.potion,file:this.selectedFile};this.addPotion(t)},onFileSelected(t){this.selectedFile=t.target.files[0],console.log(this.selectedFile.name)}}},d=u,v=o("2877"),f=o("6544"),b=o.n(f),m=o("8336"),h=o("b0af"),g=o("62ad"),x=o("a523"),y=o("4bd4"),w=o("8e36"),_=o("0fd9"),O=o("8654"),V=o("a844"),j=Object(v["a"])(d,i,c,!1,null,"aa92b9fa",null),C=j.exports;b()(j,{VBtn:m["a"],VCard:h["a"],VCol:g["a"],VContainer:x["a"],VForm:y["a"],VProgressLinear:w["a"],VRow:_["a"],VTextField:O["a"],VTextarea:V["a"]});var P={name:"App",components:{AppBar:s["default"],AddPotion:C},data:()=>({})},k=P,$=o("7496"),F=o("a75b"),S=Object(v["a"])(k,r,l,!1,null,null,null),A=S.exports;b()(S,{VApp:$["a"],VContent:F["a"]});const T=a["a"].resource("admin/potion{/id}"),B=a["a"].resource("admin/potion/{id}/image");var M={add:t=>T.save({},t),addImage:(t,e)=>B.save({id:e},t)};a["a"].use(p["a"]),a["a"].http.options.root="http://localhost:8080",a["a"].http.interceptors.push((function(t){t.headers.set("Access-Control-Allow-Origin","http://localhost:8081")}));var E=new p["a"].Store({state:{},mutations:{},actions:{async addPotion({commit:t},e){const o=await M.add(e.potion),a=await o.json(),n=new FormData;console.log(e.file),n.append("file",e.file,e.file.name),console.log(n);const r=await M.addImage(n,a.id);console.log(r)}}}),I=o("f309");a["a"].use(I["a"]);var J=new I["a"]({icons:{iconfont:"mdi"}});a["a"].config.productionTip=!1,new a["a"]({store:E,vuetify:J,render:t=>t(A)}).$mount("#app")},5983:function(t,e,o){"use strict";var a=o("8374"),n=o.n(a);e["default"]=n.a},8374:function(t,e){},"92ca":function(t,e,o){"use strict";var a=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("v-app-bar",{attrs:{app:""}},[o("v-toolbar-title",{staticClass:"headline "},[o("span",{staticClass:"text-uppercase"},[t._v("Зелья ")]),o("span",{staticClass:"font-weight-light"},[t._v("смешивай или умри")])]),o("v-spacer"),o("v-btn",{attrs:{icon:""}},[o("v-icon",[t._v("mdi-plus-circle")])],1)],1)},n=[];o.d(e,"a",(function(){return a})),o.d(e,"b",(function(){return n}))},dd38:function(t,e,o){"use strict";var a=o("92ca"),n=o("5983"),r=o("2877"),l=o("6544"),s=o.n(l),i=o("40dc"),c=o("8336"),p=o("132d"),u=o("2fa4"),d=o("2a7f"),v=Object(r["a"])(n["default"],a["a"],a["b"],!1,null,null,null);e["default"]=v.exports,s()(v,{VAppBar:i["a"],VBtn:c["a"],VIcon:p["a"],VSpacer:u["a"],VToolbarTitle:d["a"]})}});
//# sourceMappingURL=app.7a934e73.js.map