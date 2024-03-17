package org.lsposed.lspatch.loader;

import android.app.ActivityThread;
import android.app.LoadedApk;
import android.content.pm.ApplicationInfo;
import android.content.res.XResources;

import org.lsposed.lspd.impl.LSPosedContext;

import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.github.libxposed.api.XposedModuleInterface;

public class LSPLoader {
    public static void initLegacyModules(LoadedApk loadedApk) {
        XposedInit.loadedPackagesInProcess.add(loadedApk.getPackageName());
        XResources.setPackageNameForResDir(loadedApk.getPackageName(), loadedApk.getResDir());
        XC_LoadPackage.LoadPackageParam lpparam = new XC_LoadPackage.LoadPackageParam(
                XposedBridge.sLoadedPackageCallbacks);
        lpparam.packageName = loadedApk.getPackageName();
        lpparam.processName = ActivityThread.currentProcessName();
        lpparam.classLoader = loadedApk.getClassLoader();
        lpparam.appInfo = loadedApk.getApplicationInfo();
        lpparam.isFirstApplication = true;
        XC_LoadPackage.callAll(lpparam);
    }

    public static void initModules(LoadedApk loadedApk) {
        XposedModuleInterface.PackageLoadedParam param = new XposedModuleInterface.PackageLoadedParam() {
            @Override
            public String getPackageName() {
                return loadedApk.getPackageName();
            }

            @Override
            public ApplicationInfo getApplicationInfo() {
                return loadedApk.getApplicationInfo();
            }

            @Override
            public ClassLoader getDefaultClassLoader() {
                return loadedApk.getClassLoader();
            }

            @Override
            public ClassLoader getClassLoader() {
                return loadedApk.getClassLoader();
            }

            @Override
            public boolean isFirstPackage() {
                return true;
            }
        };
        LSPosedContext.callOnPackageLoaded(param);
    }
}