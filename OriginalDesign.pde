void setup()
{
	size(400,400);
	background(255, 183, 0);
}
void draw()
{
	//ground
	for (int a = 0; a < 1000; a = a + 1) {
    int x = a * 1;
    noStroke();
    fill(10, 97, 2);
    ellipse(-50+1*x,100+1*x, 5*x, 1.999*x);
	}
	//road
	for (int a = 0; a < 1000; a = a + 1) {
    int x = a * 1;
    noStroke();
    fill(0, 0, 0);
    ellipse(-50+1*x, 150+1*x, 0.1*x, 1.5*x);
	}

	for (int a = 0; a < 1000; a = a + 1) {
    int x = a * 1;
    noStroke();
    fill(255,255,0);
    ellipse(-65+2*x, 150+1*x, 0.05*x, 0.1*x);
	}
	//house
	fill(255,255,255);
	rect(150,75,200,100);
	int b = 35;
	while (b<200) {
	    fill(0, 118, 173);
	    rect(b+150,100,25,25);
	    b+=100;
	}
	fill(0);
	rect(235,130,25,45);
	fill(0);
	triangle(150,75,250,25,350,75);
	fill(0,0,0,100);
	triangle(350,175,350,125,400,125);
	//fence
	for (int a = 0; a < 50; a = a + 5) {
    int x = a * 1;
    noStroke();
    fill(117, 41, 0);
    rect(-50+10*x, 145+1*x, 0.25*x, 1.5*x);
    fill(0,0,0,100);
    triangle(-50+10*x+0.25*x,145+1*x+1.5*x,-50+10*x+0.25*x,140+1*x+1.5*x,-35+10*x+0.25*x,140+1*x+1.5*x);
	}
	for (int a = 0; a < 1000; a += 1) {
    int x = a * 1;
    noStroke();
    fill(117, 41, 0);
    ellipse(-50+10*x, 145+1*x, 2*x, 0.1*x);
	}
}

