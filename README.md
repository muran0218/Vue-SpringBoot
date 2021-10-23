* 前端
  * VUE + ElementUI + Vue-admin-template
  * axios
* 后端
  * SpringBoot + MyBatis + MySQL + Tomcat
  
  
  * 前台使用
  npm install
  npm install --save axios vue-axios
  * 如果安装失败
  npm uninstall --save axios vue-axios
  
  在main.js中引入
//引入axios模块
import axios from 'axios'
import VueAxios from 'vue-axios'
//使用axios模块
Vue.use(VueAxios,axios)