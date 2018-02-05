# vuejs_getting_started
Learning javascript using vue js (Created Jan 28, 2017)

## Motivation

Document the steps I am taking to learn javascript development. I am relatively new to javascript and this im my journey
Everything here should be considered as my development journal and nothing more. Specifically, please do not take 
anything here as being a best practice or a step-by-step guide.   

The end goal is to demonstrate a dynamic, single-page application that provides simplified, but similar functionality
as parts of the monitor that is provided with [Accumulo](https://accumulo.apache.org) with some new features for 
monitoring the Fault-Tolerant Executor (FATE) transaction system that is used in Accumulo.
   
While I have an end goal in mind, this repo may contain a lot of half-baked concepts as I explore different options
and techniques.
    
## Steps Overview

1. Step 0 - Install initial development environment for javascript development suitable for large projects
  Generated code in ./hello_vue_cli
2. Step 1 - Initial vue.js hello word (js only) and mock application layout using html / css.
  Code contained in ./proto1 

### Step 0 Goals:

See the README in ./hello_vue_cli for additional details - ths summary is here becasue the installation of node and yarn 
are global for a developer and do not need to be repeated for each project.
 
  * Setup a development environment that can scale to larger projects
    * Use [Node.js](https://nodejs.org/en/)
    * Use [Yarn Package Manager](https://yarnpkg.com/en/)
    * Use [Webpack](https://webpack.js.org/)  
    
#### Node.js installation

Install Node.js - current LTS version 8.9.4, released 2017-10-31 

1) Download tar file from [Node.js](https://nodejs.org/en/)
2) Switch to the directory whre node js should live and untar the file (tar xvf "tarfile.xz")
3) Set environment variable NODE_HOME to point to install directory.

### Yarn pacakge manager installation

Installing from tar: 

1) Download tar from [yarn-v1.3.2.tar.gz](https://github.com/yarnpkg/yarn/releases/tag/v1.3.2) released 2017-11-02):
2) Untar and set env.

### General exmaple of using yarn to install other development tools.

  ```
  > yarn init
  > yarn add --dev webpack webpack-dev-server`
  > yarn add --dev vue-cli
  > ./node_modules/vue-cli/bin/vue init webpack-simple hello_vue
  > cd hello_vue/
  > yarn install 
  
  > npm run dev
  ```
  






         
