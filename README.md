# Clean Architecture - base project

This repository can be forked to be used as a base of Clean Architecture project. It has the following file tree:

```
project
├───app
│   │   proguard-rules.pro <!-- all features proguard-rules.pro should be added here -->
│   └───src
│
├───features    <!-- all aplication features should be added here and must not implement another feature -->
│   └───home
│
└───foundation <!-- all features utils classes should be added here -->
    ├───core
    ├───core-android
    ├───data
    ├───domain
    ├───dsc
    ├───monitoring
    └───navigation
```

## General information

- Three flavors (`dev`, `beta` and `prod`) with its respective application name and `applicationId`;
- Single activity design pattern to allow deeplinking and internal navigation;
- `:features` modules without circular dependency;
- `:foundation` modules to be used in all `:features` modules;
- Clean and lightweight `:app` module.
