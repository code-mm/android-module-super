## 使用

### 添加仓库

    // 正式版本
            maven {
                url 'http://maven.mhw828.com:8081/repository/maven-releases/'
            }
    // 快照版本
            maven {
                url 'http://maven.mhw828.com:8081/repository/maven-snapshots/'
            }


### 添加依赖

         implementation 'org.ms:androidx-sdk-module-supper:latest'