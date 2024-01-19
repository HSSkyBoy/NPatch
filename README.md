# NPatch Framework

- 应用图标
～ ![icon.png](https://i.ibb.co/rpkkwgs/IMG-20240112-210620-501.png)

[![Build](https://img.shields.io/github/actions/workflow/status/HSSkyBoy/NPatch/main.yml?branch=master&logo=github&label=Build&event=push)](https://github.com/HSSkyBoy/NPatch/actions/workflows/main.yml?query=event%3Apush+is%3Acompleted+branch%3Amaster) [![Crowdin](https://img.shields.io/badge/Localization-Crowdin-blueviolet?logo=Crowdin)](https://lsposed.crowdin.com/lspatch) [![Download](https://img.shields.io/github/v/release/HSSkyBoy/NPatch?color=orange&logoColor=orange&label=Download&logo=DocuSign)](https://github.com/HSSkyBoy/NPatch/releases/latest) [![Total](https://shields.io/github/downloads/HSSkyBoy/NPatch/total?logo=Bookmeter&label=Counts&logoColor=yellow&color=yellow)](https://github.com/HSSkyBoy/NPatch/releases)

## 应用介绍 

无Root实现使用LSPosed框架，通过在目标APK中插入dex等来集成Xposed API。

## 支持版本

- 最低: Android 9
- 最高: 从理论上来讲，和 [LSPosed](https://github.com/LSPosed/LSPosed#supported-versions)的上限是一致的

## 下载方式

正式版本→请前往[Github releases page](https://github.com/HSSkyBoy/NPatch/releases)  
CI构建版本→请前往[Github Actions](https://github.com/HSSkyBoy/NPatch/actions)  
注意: debug版本只能在Github Actions中使用 

## 使用方式

+ 通过 jar
1. 下载 `lspatch.jar`
2. 运行 `java -jar lspatch.jar`

+ Through manager
1. 下载并安装`*.apk`在你的安卓(或鸿蒙)设备上
2. 按照应用的方式使用

## Star 数

[![Star History Chart](https://api.star-history.com/svg?repos=HSSkyBoy/NPatch&type=Date)](https://star-history.com/#HSSkyBoy/NPatch&Date)

## Translation Contributing

You can contribute translation [here](https://lsposed.crowdin.com/lspatch).

## Credits

- [LSPosed](https://github.com/LSPosed/LSPosed): Core framework
- [Xpatch](https://github.com/WindySha/Xpatch): Fork source
- [Apkzlib](https://android.googlesource.com/platform/tools/apkzlib): Repacking tool

## License

NPatch is licensed under the **GNU General Public License v3 (GPL-3)** (http://www.gnu.org/copyleft/gpl.html).
