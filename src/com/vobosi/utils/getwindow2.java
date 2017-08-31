package com.vobosi.utils;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class getwindow2 {
	public static void main(String[] args) throws MalformedURLException, Exception{
		// 此方法仅适用于JdK1.6及以上版本
		Desktop.getDesktop().browse(new URL("https://hao.360.cn/?1004").toURI());
		//控制键盘鼠标及截屏的jdk类
		Robot robot = new Robot();
		//延时
		robot.delay(3000);
		//获取显示器大小
		Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		int width = (int) d.getWidth()/10;
		int height = (int) d.getHeight()/10;
		System.out.println("屏幕宽为： "+width+"屏幕高为： "+height);
		// 最大化浏览器。java控制键盘的F11键按下
		robot.keyRelease(KeyEvent.VK_F11);
		robot.delay(2000);
		//获取截屏(截图起始点x,截图起始点y,截屏宽,截屏高)
		Image image = robot.createScreenCapture(new Rectangle(0, 0, width, height));
		//图片流
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
		//获取画刷并把截图写入图片中
		Graphics g = bi.createGraphics();
		g.drawImage(image, 0, 0, width, height, null);
		// 保存图片
		ImageIO.write(bi, "jpg", new File("google.jpg"));
	}
}
