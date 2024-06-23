import drawMapGrid from "./drawMapGrid.js";

const width = parseInt(prompt("输入地图宽"));
const height = parseInt(prompt("输入地图高"));

const canvas = document.getElementById("map-editor");
const ctx = canvas.getContext("2d");
canvas.width = width;
canvas.height = height;

drawMapGrid(ctx, width, height)

