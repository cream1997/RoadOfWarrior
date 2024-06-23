export default function drawCircleMapObj(ctxOf2D, x, y, radius, color) {
    ctxOf2D.beginPath()
    ctxOf2D.arc(x + radius, y + radius, radius, 0, Math.PI * 2, false)
    ctxOf2D.fillStyle = color
    ctxOf2D.fill()
    ctxOf2D.closePath()
}