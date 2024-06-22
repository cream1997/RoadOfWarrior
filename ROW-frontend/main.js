const {app, BrowserWindow} = require('electron')

const createWindow = () => {
    const win = new BrowserWindow({width: 800, height: 600});
    win.loadFile("index.html")
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