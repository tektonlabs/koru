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

class ContinueCell: UICollectionViewCell {
    let viewModel = ContinueCellViewModel()
    
    @IBOutlet weak var continueButton: UIButton!
    override func awakeFromNib() {
        super.awakeFromNib()
        styleUI()
        fillUI()
    }
    
    func styleUI() {
        continueButton.layer.cornerRadius = 2
        continueButton.backgroundColor = ColorPalette.blueButton
        continueButton.setTitleColor(UIColor.white, for: .normal)
        continueButton.layer.masksToBounds = false
        continueButton.layer.shadowColor = UIColor.black.cgColor
        continueButton.layer.shadowOpacity = 0.5
        continueButton.layer.shadowOffset = CGSize(width: -1, height: 1)
        continueButton.layer.shadowRadius = 1
    }
    
    func fillUI() {
        continueButton.setTitle("CONTINUAR", for: .normal)
    }
    
    @IBAction func didTouchContinue(_ sender: Any) {
        viewModel.delegate?.didTouchButton(cell: self)
    }
}