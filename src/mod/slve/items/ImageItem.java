package mod.slve.items;

import java.awt.Image;
import java.util.ArrayList;

public class ImageItem extends ItemThatReturnAnImage{
	int focusImage = 0;
	ArrayList<Image> images = new ArrayList<Image>();
	
	public ImageItem (Image img, String name, int posX, int posY, int width, int height) {
		images.add(img);
		m_name = name;
		m_posX = posX+"";
		m_posY = posY+"";
		m_width = width+"";
		m_height = height+"";
		cachePosX = posX;
		cachePosY = posY;
		cacheWidth = width;
		cacheHeight = height;
		cacheRotation = 0;
		m_ratio = width/(height*1.0);
		m_id = 1;
		addKeyFrameTranslate(0, posX+"", posY+"",1);
		addKeyFrameRotation(0, 0+"", 1);
		addKeyFrameActiv(0);
	}
	
	public ImageItem (Image img, String name, int posX, int posY) {
		images.add(img);
		m_name = name;
		m_posX = posX+"";
		m_posY = posY+"";
		m_width = img.getWidth(null)+"";
		m_height = img.getHeight(null)+"";
		cachePosX = posX;
		cachePosY = posY;
		cacheWidth = img.getWidth(null);
		cacheHeight = img.getHeight(null);
		cacheRotation = 0;
		m_ratio = getWidth()/(getHeight()*1.0);
		m_id = 1;
		addKeyFrameTranslate(0, posX+"", posY+"",1);
		addKeyFrameRotation(0, 0+"", 1);
		addKeyFrameActiv(0);
	}
	
	@Override
	public Image getImage () {
		return images.get(focusImage);
	}
	
	public void setImage (Image image) {
		images.remove(0);
		images.add(image);
	}

}