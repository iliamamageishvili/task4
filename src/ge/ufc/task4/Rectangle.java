package ge.ufc.task4;

public class Rectangle {
	private float height;
	private float width;
	private static float maxHeight;
	private static float maxWidth;
	private static final int random;

static {
	maxHeight = 30;
	maxWidth = 30;
	random = 20;
}

public Rectangle(float height) {
	setHeight(height);
}
public Rectangle(float height, float width) {
	setHeight(height);
	setWidth(width);
}

public Rectangle() {
	setWidth(random);
}

public void setHeight(float height) {
	if(height <= maxHeight)  this.height = height;
	else this.height = maxHeight;
}

public void setWidth(float width) {
	if(width <= maxWidth) this.width = width;
	else this.width = maxWidth;
}

public float getHeight() {
	return height;
}

public float getWidth() {
	return width;
}

public float perimeter() {
	return 2*(height + width);
}

public float area() {
	return height * width;
}

public int  isEqual(Rectangle r1 ,Rectangle r2) {
	int ans = 0;
		if(r1.area() > r2.area())
			ans = 1;
		if(r1.area() < r2.area())
			ans = -1;
	return ans;
}

public static Rectangle maxArea(Rectangle arr[]) {
	Rectangle maxRec = arr[0];
for(int i = 1; i <arr.length; i++) {
	if(maxRec.area() <= arr[i].area()) {
		maxRec = arr[i];
	}
		
}
	return maxRec;
}
}
