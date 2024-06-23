import drawMapGrid from "../common/drawMapGrid.js";
import drawCircleMapObj from "./drawCircleMapObj.js";

const canvas = document.getElementById("gameCanvas");
const ctx = canvas.getContext("2d");

const mapWidth = 800
const mapHeight = 600
canvas.width = mapWidth;
canvas.height = mapHeight

let playerX = 50
let playerY = 50
const playerRadius = 25
const playerColor = "blue"

function drawMap() {
    ctx.clearRect(0, 0, mapWidth, mapHeight)
    drawMapGrid(ctx, mapWidth, mapHeight)
    drawCircleMapObj(ctx, playerX, playerY, playerRadius, playerColor)
}

drawMap()

document.addEventListener("keydown", handlerMoveKeyDown)

function handlerMoveKeyDown(event) {
    switch(event.key) {
        case 'ArrowUp':
            if (playerY - playerRadius * 2 >= 0) {
                playerY -= playerRadius * 2; // 调整移动距离以适应圆形的直径
            }
            break;
        case 'ArrowDown':
            if (playerY + playerRadius * 2 <= mapHeight) {
                playerY += playerRadius * 2;
            }
            break;
        case 'ArrowLeft':
            if (playerX - playerRadius * 2 >= 0) {
                playerX -= playerRadius * 2;
            }
            break;
        case 'ArrowRight':
            if (playerX + playerRadius * 2 <= mapWidth) {
                playerX += playerRadius * 2;
            }
            break;
    }
    drawMap()
}