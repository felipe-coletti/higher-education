function ConvertBase64ToImage(base64String) { 
    return `data:image/png;base64,${base64String}`
} 

export default ConvertBase64ToImage