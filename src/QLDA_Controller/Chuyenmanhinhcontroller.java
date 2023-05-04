/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_Controller;

import QLDA_DMbean.beant;
import QLDA_Model.KHACHHANG;
import QLDA_View.BanHang;
import QLDA_View.Changematkhau;
import QLDA_View.Login;
//import QLDA_View.SanPham;
import QLDA_View.Nhanvien;
import QLDA_View.Regiter;
import QLDA_View.SanPham;
import QLDA_View.ThongKe;
import QLDA_View.Trangchu;
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NGUYEN DUNG
 */
public class Chuyenmanhinhcontroller {

    private JPanel root;
    private String KindSelected = "";
    private ArrayList<beant> ListItem = null;

    public Chuyenmanhinhcontroller(JPanel jpnroot) {
        this.root = jpnroot;
    }

    public void Setview(JPanel jbnIteam, JLabel jlbnIteam) {
        KindSelected = "TrangChu";
        jbnIteam.setBackground(new Color(96, 100, 191));
        jlbnIteam.setBackground(new Color(96, 100, 191));

        root.remove(root);
        root.setLayout(new BorderLayout());
        root.add(new Trangchu());
        root.validate();
        root.repaint();

    }

    public void setEvent(ArrayList<beant> listItem) {
        this.ListItem = listItem;
        for (beant item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private final String kind;

        private final JPanel jpnItem;
        private final JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new Trangchu();
                    break;
                case "KhachHang":
                   try {
                    node = new Nhanvien();
                } catch (Exception ex) {

                }
                break;

                case "SanPham":
                     try {
                    node = new SanPham();

                } catch (Exception ex) {

                }
                break;

                case "HoaDon":
                     try {
                    node = new BanHang();

                } catch (Exception ex) {

                }
                break;

                case "ThongKe":
                     try {
                    node = new ThongKe();

                } catch (Exception ex) {

                }
                break;

                case "Thoat":
                     try {
                    node = new Changematkhau();
                    

                } catch (Exception ex) {

                }
                default:
                    break;
            }
            // mor e
            root.removeAll();

            root.setLayout(
                    new BorderLayout());
            root.add(node);

            root.validate();

            root.repaint();

            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
//            String kindSelected = kind;
//            jpnItem.setBackground(new Color(96, 100, 191));
//            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            jpnItem.setBackground(new Color(96, 100, 191));
//            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            String kindSelected = kind;
//            if (!kindSelected.equalsIgnoreCase(kind)) {
//                jpnItem.setBackground(new Color(76, 175, 80));
//                jlbItem.setBackground(new Color(76, 175, 80));
//            }
        }

    }

    public void setChangeBackground(String kind) {
        for (beant item : ListItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJlb().setBackground(new Color(96, 100, 191));

            } else {
                item.getJpn().setBackground(new Color(76, 175, 80));
                item.getJlb().setBackground(new Color(76, 175, 80));

            }
        }
    }

}
