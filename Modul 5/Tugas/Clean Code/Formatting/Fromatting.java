/* fill(80,204,55);rect(100,0,200,400);
var draw=function(){var numCircles = 6;for (var i=numCircles; i>1; i--){var
radius=i*7;
if (mouseX>100&&mouseX<300)
{fill(255,255,255);}else{fill(80,204,55);}ellipse(mouseX,mouseY,radius,radi
us);}};*/

//menambhakan warna background
fill(80, 204, 55);
rect(100, 0, 200, 400);

// membuat function gambar
var draw = function() {
    var numCircles = 6;
    
    // looping utnuk membuat lingkaran
    for (var i = numCircles; i > 1; i--) {
        var radius = i * 7;

        // mengganti warna lingkaran jika mouse digerakkan
        if (mouseX > 100 && mouseX < 300) {
            fill(255, 255, 255); // warna putih
        } else {
            fill(80, 204, 55); // warna default hijau
        }

        // menggambar lingkaran ppada area mousenya
        ellipse(mouseX, mouseY, radius, radius);
    }
};
