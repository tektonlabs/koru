/* 

=========================================================================== 
Koru GPL Source Code 
Copyright (C) 2017 Tekton Labs
This file is part of the Koru GPL Source Code.
Koru Source Code is free software: you can redistribute it and/or modify 
it under the terms of the GNU General Public License as published by 
the Free Software Foundation, either version 3 of the License, or 
(at your option) any later version. 

Koru Source Code is distributed in the hope that it will be useful, 
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the 
GNU General Public License for more details. 

You should have received a copy of the GNU General Public License 
along with Koru Source Code. If not, see <http://www.gnu.org/licenses/>. 
=========================================================================== 

*/

import UIKit

class QuestionCell: UITableViewCell {

    @IBOutlet weak var questionLabel: UILabel!
    override func awakeFromNib() {
        super.awakeFromNib()
        styleUI()
    }

    override func draw(_ rect: CGRect) {
        super.draw(rect)
        
        let path = UIBezierPath(roundedRect: self.bounds, byRoundingCorners: [.topLeft, .topRight], cornerRadii: CGSize(width: 5, height: 5)).cgPath
        let rectShape = CAShapeLayer()
        rectShape.path = path
        self.layer.mask = rectShape
    }

    
    func styleUI() {
        self.backgroundColor = ColorPalette.purple
        questionLabel.font = UIFont(name: "Roboto-Regular", size: 17)
        questionLabel.textColor = UIColor.white
    }

}