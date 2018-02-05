# Step 0: hello_vue_cli

## Goals:

  * Setup a development environment that can scale to larger projects
    * Use [Node.js](https://nodejs.org/en/)
    * Use [Yarn Package Manager](https://yarnpkg.com/en/)
    * Use [Webpack](https://webpack.js.org/)
    * Have a simple vue.js hello world sample.
    
#### Node.js installation

Install Node.js - current LTS version 8.9.4, released 2017-10-31 

1) Download tar file from [Node.js](https://nodejs.org/en/)
2) Switch to the directory whre node js should live and untar the file (tar xvf "tarfile.xz")
3) Set environment variable NODE_HOME to point to install directory.

### Yarn pacakge manager installation

Installing from tar: 

1) Download tar from [yarn-v1.3.2.tar.gz](https://github.com/yarnpkg/yarn/releases/tag/v1.3.2) released 2017-11-02):
2) Untar and set env.

### Using yarn to install other development tools.

  ```
  > yarn init
  > yarn add --dev webpack webpack-dev-server`
  > yarn add --dev vue-cli
  > ./node_modules/vue-cli/bin/vue init webpack-simple hello_vue
  > cd hello_vue/
  > yarn install 
  
  > npm run dev
  ```
  
After running vue init, the generated application frame work can be viewed in a browser.

### running using npm, with out yarn 

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build
```

For detailed explanation on how things work, consult the [docs for vue-loader](http://vuejs.github.io/vue-loader).
