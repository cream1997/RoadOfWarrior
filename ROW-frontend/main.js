const {app, BrowserWindow} = require('electron')
const path = require("path");

const createWindow = () => {
    const mainWindow = new BrowserWindow({
        width: 1000,
        height: 700,
        webPreferences: {
            preload: path.join(__dirname, "preload.js")
        },
        autoHideMenuBar:true
    });
    mainWindow.loadFile("./pages/index.html")

    // 打开开发工具
    mainWindow.webContents.openDevTools()
}

app.whenReady().then(() => {
    createWindow()
    // 为macOS做特殊处理
    app.on("activate", () => {
        if (BrowserWindow.getAllWindows().length === 0) {
            createWindow();
        }
    })
})

app.on("window-all-closed", () => {
    if (process.platform !== "darwin") { //不是macOS
        app.quit();
    }
})

// 在当前文件中你可以引入所有的主进程代码
// 也可以拆分成几个文件，然后用 require 导入。