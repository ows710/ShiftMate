-- 근무신청 테이블 생성
CREATE TABLE dutyrequest (
    req_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '신청번호',
    req_date DATE NOT NULL COMMENT '신청일',
    submitted_at DATE DEFAULT NULL COMMENT '제출일',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
    nurse_id INT NOT NULL COMMENT '간호사번호',
    INDEX idx_nurse_date (nurse_id, req_date),
    INDEX idx_req_date (req_date)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='근무신청 정보';

-- schedule 테이블 생성 (이미 있다면 무시)
CREATE TABLE IF NOT EXISTS schedule (
    shift_date DATE NOT NULL COMMENT '근무일',
    nurse_id INT NOT NULL COMMENT '간호사번호',
    shift_type VARCHAR(10) NOT NULL COMMENT '근무타입 (O:Off, D:Day, E:Evening, N:Night)',
    is_auto VARCHAR(1) DEFAULT 'N' COMMENT '자동여부 (Y:자동, N:수동)',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
    nurse_name VARCHAR(50) DEFAULT NULL COMMENT '간호사명',
    hire_date DATE DEFAULT NULL COMMENT '입사일',
    PRIMARY KEY (shift_date, nurse_id),
    INDEX idx_nurse_date (nurse_id, shift_date),
    INDEX idx_shift_type (shift_type)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='스케줄 정보';

-- 샘플 데이터 삽입
INSERT INTO dutyrequest (req_date, nurse_id) VALUES
('2025-09-02', 1),
('2025-09-17', 1),
('2025-09-20', 1),
('2025-09-26', 1);

INSERT INTO schedule (shift_date, nurse_id, shift_type, is_auto) VALUES
('2025-09-02', 1, 'E', 'N'),
('2025-09-17', 1, 'O', 'N'),
('2025-09-20', 1, 'D', 'N'),
('2025-09-26', 1, 'N', 'N'); 